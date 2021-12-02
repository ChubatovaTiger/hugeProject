package subProj_1148

import subProj_1148.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1148")
    name = "subProj 1148"

    buildType(subProj_bt_1148_0)
    buildType(subProj_bt_1148_1)
    buildType(subProj_bt_1148_4)
    buildType(subProj_bt_1148_5)
    buildType(subProj_bt_1148_2)
    buildType(subProj_bt_1148_3)
})
