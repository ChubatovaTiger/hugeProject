package subProj_230

import subProj_230.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_230")
    name = "subProj 230"

    buildType(subProj_bt_230_5)
    buildType(subProj_bt_230_2)
    buildType(subProj_bt_230_1)
    buildType(subProj_bt_230_4)
    buildType(subProj_bt_230_3)
    buildType(subProj_bt_230_0)
})
