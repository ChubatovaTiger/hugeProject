package subProj_662

import subProj_662.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_662")
    name = "subProj 662"

    buildType(subProj_bt_662_1)
    buildType(subProj_bt_662_0)
    buildType(subProj_bt_662_5)
    buildType(subProj_bt_662_4)
    buildType(subProj_bt_662_3)
    buildType(subProj_bt_662_2)
})
