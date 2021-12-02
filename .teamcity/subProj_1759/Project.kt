package subProj_1759

import subProj_1759.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1759")
    name = "subProj 1759"

    buildType(subProj_bt_1759_5)
    buildType(subProj_bt_1759_4)
    buildType(subProj_bt_1759_3)
    buildType(subProj_bt_1759_2)
    buildType(subProj_bt_1759_1)
    buildType(subProj_bt_1759_0)
})
