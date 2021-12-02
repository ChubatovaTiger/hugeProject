package subProj_1328

import subProj_1328.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1328")
    name = "subProj 1328"

    buildType(subProj_bt_1328_4)
    buildType(subProj_bt_1328_5)
    buildType(subProj_bt_1328_2)
    buildType(subProj_bt_1328_3)
    buildType(subProj_bt_1328_0)
    buildType(subProj_bt_1328_1)
})
