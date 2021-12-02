package subProj_1762

import subProj_1762.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1762")
    name = "subProj 1762"

    buildType(subProj_bt_1762_0)
    buildType(subProj_bt_1762_1)
    buildType(subProj_bt_1762_2)
    buildType(subProj_bt_1762_3)
    buildType(subProj_bt_1762_4)
    buildType(subProj_bt_1762_5)
})
