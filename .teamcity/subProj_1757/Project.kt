package subProj_1757

import subProj_1757.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1757")
    name = "subProj 1757"

    buildType(subProj_bt_1757_1)
    buildType(subProj_bt_1757_0)
    buildType(subProj_bt_1757_5)
    buildType(subProj_bt_1757_4)
    buildType(subProj_bt_1757_3)
    buildType(subProj_bt_1757_2)
})
