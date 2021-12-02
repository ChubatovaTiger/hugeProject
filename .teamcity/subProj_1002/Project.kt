package subProj_1002

import subProj_1002.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1002")
    name = "subProj 1002"

    buildType(subProj_bt_1002_3)
    buildType(subProj_bt_1002_4)
    buildType(subProj_bt_1002_1)
    buildType(subProj_bt_1002_2)
    buildType(subProj_bt_1002_5)
    buildType(subProj_bt_1002_0)
})
