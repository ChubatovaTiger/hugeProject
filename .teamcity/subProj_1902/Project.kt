package subProj_1902

import subProj_1902.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1902")
    name = "subProj 1902"

    buildType(subProj_bt_1902_1)
    buildType(subProj_bt_1902_0)
    buildType(subProj_bt_1902_3)
    buildType(subProj_bt_1902_2)
    buildType(subProj_bt_1902_5)
    buildType(subProj_bt_1902_4)
})
