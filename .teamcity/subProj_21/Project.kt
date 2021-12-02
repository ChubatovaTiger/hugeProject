package subProj_21

import subProj_21.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_21")
    name = "subProj 21"

    buildType(subProj_bt_21_0)
    buildType(subProj_bt_21_1)
    buildType(subProj_bt_21_2)
    buildType(subProj_bt_21_3)
    buildType(subProj_bt_21_4)
    buildType(subProj_bt_21_5)
})
