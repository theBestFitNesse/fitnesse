// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.fixtures;

import fit.ColumnFixture;
import fitnesse.authentication.OneUserAuthenticator;

public class AuthenticatorSetup extends ColumnFixture {
  public String username;
  public String password;

  public String status() {
    FitnesseFixtureContext.context.authenticator = new OneUserAuthenticator(username, password);
    return "ok";
  }
}
