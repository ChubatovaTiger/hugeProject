package subProj_912

import subProj_912.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_912")
    name = "subProj 912"

    buildType(subProj_bt_912_1)
    buildType(subProj_bt_912_0)
    buildType(subProj_bt_912_5)
    buildType(subProj_bt_912_4)
    buildType(subProj_bt_912_3)
    buildType(subProj_bt_912_2)
})
