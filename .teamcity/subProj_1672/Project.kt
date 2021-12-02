package subProj_1672

import subProj_1672.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1672")
    name = "subProj 1672"

    buildType(subProj_bt_1672_0)
    buildType(subProj_bt_1672_1)
    buildType(subProj_bt_1672_4)
    buildType(subProj_bt_1672_5)
    buildType(subProj_bt_1672_2)
    buildType(subProj_bt_1672_3)
})
