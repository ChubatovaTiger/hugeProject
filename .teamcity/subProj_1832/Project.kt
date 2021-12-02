package subProj_1832

import subProj_1832.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1832")
    name = "subProj 1832"

    buildType(subProj_bt_1832_1)
    buildType(subProj_bt_1832_0)
    buildType(subProj_bt_1832_3)
    buildType(subProj_bt_1832_2)
    buildType(subProj_bt_1832_5)
    buildType(subProj_bt_1832_4)
})
