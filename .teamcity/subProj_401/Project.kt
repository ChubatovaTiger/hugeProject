package subProj_401

import subProj_401.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_401")
    name = "subProj 401"

    buildType(subProj_bt_401_0)
    buildType(subProj_bt_401_1)
    buildType(subProj_bt_401_2)
    buildType(subProj_bt_401_3)
    buildType(subProj_bt_401_4)
    buildType(subProj_bt_401_5)
})
