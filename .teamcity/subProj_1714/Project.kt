package subProj_1714

import subProj_1714.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1714")
    name = "subProj 1714"

    buildType(subProj_bt_1714_0)
    buildType(subProj_bt_1714_5)
    buildType(subProj_bt_1714_3)
    buildType(subProj_bt_1714_4)
    buildType(subProj_bt_1714_1)
    buildType(subProj_bt_1714_2)
})
