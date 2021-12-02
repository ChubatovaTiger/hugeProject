package subProj_1276

import subProj_1276.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1276")
    name = "subProj 1276"

    buildType(subProj_bt_1276_4)
    buildType(subProj_bt_1276_5)
    buildType(subProj_bt_1276_2)
    buildType(subProj_bt_1276_3)
    buildType(subProj_bt_1276_0)
    buildType(subProj_bt_1276_1)
})
