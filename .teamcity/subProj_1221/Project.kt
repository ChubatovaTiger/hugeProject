package subProj_1221

import subProj_1221.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1221")
    name = "subProj 1221"

    buildType(subProj_bt_1221_1)
    buildType(subProj_bt_1221_0)
    buildType(subProj_bt_1221_5)
    buildType(subProj_bt_1221_4)
    buildType(subProj_bt_1221_3)
    buildType(subProj_bt_1221_2)
})
