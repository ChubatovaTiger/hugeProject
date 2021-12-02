package subProj_1794

import subProj_1794.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1794")
    name = "subProj 1794"

    buildType(subProj_bt_1794_0)
    buildType(subProj_bt_1794_2)
    buildType(subProj_bt_1794_1)
    buildType(subProj_bt_1794_4)
    buildType(subProj_bt_1794_3)
    buildType(subProj_bt_1794_5)
})
