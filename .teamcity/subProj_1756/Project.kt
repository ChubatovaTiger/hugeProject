package subProj_1756

import subProj_1756.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1756")
    name = "subProj 1756"

    buildType(subProj_bt_1756_2)
    buildType(subProj_bt_1756_1)
    buildType(subProj_bt_1756_0)
    buildType(subProj_bt_1756_5)
    buildType(subProj_bt_1756_4)
    buildType(subProj_bt_1756_3)
})
