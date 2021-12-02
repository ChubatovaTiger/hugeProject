package subProj_1800

import subProj_1800.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1800")
    name = "subProj 1800"

    buildType(subProj_bt_1800_2)
    buildType(subProj_bt_1800_1)
    buildType(subProj_bt_1800_0)
    buildType(subProj_bt_1800_5)
    buildType(subProj_bt_1800_4)
    buildType(subProj_bt_1800_3)
})
