package subProj_1482

import subProj_1482.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1482")
    name = "subProj 1482"

    buildType(subProj_bt_1482_3)
    buildType(subProj_bt_1482_4)
    buildType(subProj_bt_1482_1)
    buildType(subProj_bt_1482_2)
    buildType(subProj_bt_1482_0)
    buildType(subProj_bt_1482_5)
})
