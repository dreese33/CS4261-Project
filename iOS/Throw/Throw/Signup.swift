//
//  Signup.swift
//  Throw
//
//  Created by Eric Reese on 9/1/19.
//  Copyright © 2019 ReeseGames. All rights reserved.
//

import Foundation
import UIKit

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
    
    @IBAction func signupAction(_ sender: UIButton) {
        //Send values to database here
        
        let newController = storyboard?.instantiateViewController(withIdentifier: "home")
        self.present(newController!, animated: true, completion: nil)
    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
    }
}
