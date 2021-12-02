package subProj_701

import subProj_701.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_701")
    name = "subProj 701"

    buildType(subProj_bt_701_4)
    buildType(subProj_bt_701_5)
    buildType(subProj_bt_701_2)
    buildType(subProj_bt_701_3)
    buildType(subProj_bt_701_0)
    buildType(subProj_bt_701_1)
})
