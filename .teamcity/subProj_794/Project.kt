package subProj_794

import subProj_794.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_794")
    name = "subProj 794"

    buildType(subProj_bt_794_0)
    buildType(subProj_bt_794_1)
    buildType(subProj_bt_794_4)
    buildType(subProj_bt_794_5)
    buildType(subProj_bt_794_2)
    buildType(subProj_bt_794_3)
})
