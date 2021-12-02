package subProj_1741

import subProj_1741.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1741")
    name = "subProj 1741"

    buildType(subProj_bt_1741_5)
    buildType(subProj_bt_1741_4)
    buildType(subProj_bt_1741_3)
    buildType(subProj_bt_1741_2)
    buildType(subProj_bt_1741_1)
    buildType(subProj_bt_1741_0)
})
