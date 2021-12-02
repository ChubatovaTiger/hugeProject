package subProj_1662

import subProj_1662.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1662")
    name = "subProj 1662"

    buildType(subProj_bt_1662_0)
    buildType(subProj_bt_1662_3)
    buildType(subProj_bt_1662_4)
    buildType(subProj_bt_1662_1)
    buildType(subProj_bt_1662_2)
    buildType(subProj_bt_1662_5)
})
