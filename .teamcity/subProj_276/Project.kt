package subProj_276

import subProj_276.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_276")
    name = "subProj 276"

    buildType(subProj_bt_276_5)
    buildType(subProj_bt_276_4)
    buildType(subProj_bt_276_3)
    buildType(subProj_bt_276_2)
    buildType(subProj_bt_276_1)
    buildType(subProj_bt_276_0)
})
