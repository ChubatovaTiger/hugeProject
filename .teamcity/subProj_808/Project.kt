package subProj_808

import subProj_808.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_808")
    name = "subProj 808"

    buildType(subProj_bt_808_0)
    buildType(subProj_bt_808_1)
    buildType(subProj_bt_808_2)
    buildType(subProj_bt_808_3)
    buildType(subProj_bt_808_4)
    buildType(subProj_bt_808_5)
})
