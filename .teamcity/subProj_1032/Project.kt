package subProj_1032

import subProj_1032.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1032")
    name = "subProj 1032"

    buildType(subProj_bt_1032_4)
    buildType(subProj_bt_1032_5)
    buildType(subProj_bt_1032_0)
    buildType(subProj_bt_1032_1)
    buildType(subProj_bt_1032_2)
    buildType(subProj_bt_1032_3)
})
