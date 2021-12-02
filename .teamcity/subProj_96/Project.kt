package subProj_96

import subProj_96.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_96")
    name = "subProj 96"

    buildType(subProj_bt_96_0)
    buildType(subProj_bt_96_4)
    buildType(subProj_bt_96_3)
    buildType(subProj_bt_96_2)
    buildType(subProj_bt_96_1)
    buildType(subProj_bt_96_5)
})
