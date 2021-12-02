package subProj_246

import subProj_246.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_246")
    name = "subProj 246"

    buildType(subProj_bt_246_4)
    buildType(subProj_bt_246_5)
    buildType(subProj_bt_246_2)
    buildType(subProj_bt_246_3)
    buildType(subProj_bt_246_0)
    buildType(subProj_bt_246_1)
})
