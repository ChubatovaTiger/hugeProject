package subProj_1506

import subProj_1506.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1506")
    name = "subProj 1506"

    buildType(subProj_bt_1506_1)
    buildType(subProj_bt_1506_0)
    buildType(subProj_bt_1506_3)
    buildType(subProj_bt_1506_2)
    buildType(subProj_bt_1506_5)
    buildType(subProj_bt_1506_4)
})
