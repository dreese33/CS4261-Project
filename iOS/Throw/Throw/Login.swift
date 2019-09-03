//
//  Login.swift
//  Throw
//
//  Created by Eric Reese on 9/1/19.
//  Copyright © 2019 ReeseGames. All rights reserved.
//

import Foundation
import UIKit

class Login: UIViewController {
    
    @IBAction func loginAction(_ sender: UIButton) {
        //Validate credentials here
        
        let newController = storyboard?.instantiateViewController(withIdentifier: "home")
        self.present(newController!, animated: true, completion: nil)
    }
}
