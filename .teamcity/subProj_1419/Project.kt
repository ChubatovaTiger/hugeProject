package subProj_1419

import subProj_1419.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1419")
    name = "subProj 1419"

    buildType(subProj_bt_1419_2)
    buildType(subProj_bt_1419_1)
    buildType(subProj_bt_1419_0)
    buildType(subProj_bt_1419_5)
    buildType(subProj_bt_1419_4)
    buildType(subProj_bt_1419_3)
})
