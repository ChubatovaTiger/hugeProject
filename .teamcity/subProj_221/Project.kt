package subProj_221

import subProj_221.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_221")
    name = "subProj 221"

    buildType(subProj_bt_221_4)
    buildType(subProj_bt_221_3)
    buildType(subProj_bt_221_5)
    buildType(subProj_bt_221_0)
    buildType(subProj_bt_221_2)
    buildType(subProj_bt_221_1)
})
