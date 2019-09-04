//
//  Signup.swift
//  Throw
//
//  Created by Eric Reese on 9/1/19.
//  Copyright © 2019 ReeseGames. All rights reserved.
//

import Foundation
import UIKit
import AWSAppSync

class Signup: UIViewController {
    
    @IBOutlet weak var email: UITextField!
    @IBOutlet weak var confirmEmail: UITextField!
    @IBOutlet weak var username: UITextField!
    @IBOutlet weak var streetAddress: UITextField!
    @IBOutlet weak var address: UITextField!
    @IBOutlet weak var country: UITextField!
    @IBOutlet weak var password: UITextField!
    @IBOutlet weak var confirmPassword: UITextField!
    @IBOutlet weak var city: UITextField!
    @IBOutlet weak var state: UITextField!
    @IBOutlet weak var firstName: UITextField!
    @IBOutlet weak var lastName: UITextField!
    
    var outletArray: Array<UITextField>?
    var appSyncClient: AWSAppSyncClient?
    
    @IBAction func signupAction(_ sender: UIButton) {
        //Send values to database here
        if (!testFieldEmpty()) {
            let newController = storyboard?.instantiateViewController(withIdentifier: "home")
            self.present(newController!, animated: true, completion: nil)
        } else {
            let alert = UIAlertController(title: "Signup Failed", message: "One or more fields were left blank", preferredStyle: .alert)
            alert.addAction(UIAlertAction(title: "Okay", style: .default, handler: nil))
            self.present(alert, animated: true, completion: nil)
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        outletArray = [self.email, self.confirmEmail, self.username, self.streetAddress, self.address,
                       self.country, self.password, self.confirmPassword, self.city, self.state,
                       self.firstName, self.lastName]
        
        //App sync client initialization
        let appDelegate = UIApplication.shared.delegate as! AppDelegate
        appSyncClient = appDelegate.appSyncClient
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
    }
    
    //Determines if there is an empty text field
    func testFieldEmpty() -> Bool {
        for component in self.outletArray! {
            if (component.text == "") {
                return true
            }
        }
        
        return false
    }
}
