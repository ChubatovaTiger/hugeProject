package subProj_1860

import subProj_1860.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1860")
    name = "subProj 1860"

    buildType(subProj_bt_1860_5)
    buildType(subProj_bt_1860_3)
    buildType(subProj_bt_1860_4)
    buildType(subProj_bt_1860_1)
    buildType(subProj_bt_1860_2)
    buildType(subProj_bt_1860_0)
})
