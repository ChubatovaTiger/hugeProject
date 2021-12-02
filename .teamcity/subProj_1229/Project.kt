package subProj_1229

import subProj_1229.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1229")
    name = "subProj 1229"

    buildType(subProj_bt_1229_0)
    buildType(subProj_bt_1229_1)
    buildType(subProj_bt_1229_2)
    buildType(subProj_bt_1229_3)
    buildType(subProj_bt_1229_4)
    buildType(subProj_bt_1229_5)
})
