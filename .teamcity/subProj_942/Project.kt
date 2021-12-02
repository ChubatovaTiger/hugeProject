package subProj_942

import subProj_942.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_942")
    name = "subProj 942"

    buildType(subProj_bt_942_5)
    buildType(subProj_bt_942_0)
    buildType(subProj_bt_942_1)
    buildType(subProj_bt_942_2)
    buildType(subProj_bt_942_3)
    buildType(subProj_bt_942_4)
})
