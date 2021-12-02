package subProj_1747

import subProj_1747.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1747")
    name = "subProj 1747"

    buildType(subProj_bt_1747_0)
    buildType(subProj_bt_1747_5)
    buildType(subProj_bt_1747_4)
    buildType(subProj_bt_1747_3)
    buildType(subProj_bt_1747_2)
    buildType(subProj_bt_1747_1)
})
