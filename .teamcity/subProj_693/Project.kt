package subProj_693

import subProj_693.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_693")
    name = "subProj 693"

    buildType(subProj_bt_693_4)
    buildType(subProj_bt_693_5)
    buildType(subProj_bt_693_0)
    buildType(subProj_bt_693_1)
    buildType(subProj_bt_693_2)
    buildType(subProj_bt_693_3)
})
