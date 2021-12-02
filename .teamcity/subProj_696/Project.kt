package subProj_696

import subProj_696.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_696")
    name = "subProj 696"

    buildType(subProj_bt_696_1)
    buildType(subProj_bt_696_2)
    buildType(subProj_bt_696_3)
    buildType(subProj_bt_696_4)
    buildType(subProj_bt_696_5)
    buildType(subProj_bt_696_0)
})
