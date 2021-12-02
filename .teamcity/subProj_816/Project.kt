package subProj_816

import subProj_816.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_816")
    name = "subProj 816"

    buildType(subProj_bt_816_0)
    buildType(subProj_bt_816_2)
    buildType(subProj_bt_816_1)
    buildType(subProj_bt_816_4)
    buildType(subProj_bt_816_3)
    buildType(subProj_bt_816_5)
})
