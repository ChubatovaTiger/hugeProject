package subProj_773

import subProj_773.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_773")
    name = "subProj 773"

    buildType(subProj_bt_773_0)
    buildType(subProj_bt_773_5)
    buildType(subProj_bt_773_2)
    buildType(subProj_bt_773_1)
    buildType(subProj_bt_773_4)
    buildType(subProj_bt_773_3)
})
