package subProj_909

import subProj_909.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_909")
    name = "subProj 909"

    buildType(subProj_bt_909_4)
    buildType(subProj_bt_909_5)
    buildType(subProj_bt_909_2)
    buildType(subProj_bt_909_3)
    buildType(subProj_bt_909_0)
    buildType(subProj_bt_909_1)
})
