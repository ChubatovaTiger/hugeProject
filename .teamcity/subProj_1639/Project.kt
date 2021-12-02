package subProj_1639

import subProj_1639.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1639")
    name = "subProj 1639"

    buildType(subProj_bt_1639_0)
    buildType(subProj_bt_1639_1)
    buildType(subProj_bt_1639_2)
    buildType(subProj_bt_1639_3)
    buildType(subProj_bt_1639_4)
    buildType(subProj_bt_1639_5)
})
