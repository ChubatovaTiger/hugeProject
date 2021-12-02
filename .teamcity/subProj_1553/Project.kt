package subProj_1553

import subProj_1553.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1553")
    name = "subProj 1553"

    buildType(subProj_bt_1553_3)
    buildType(subProj_bt_1553_2)
    buildType(subProj_bt_1553_1)
    buildType(subProj_bt_1553_0)
    buildType(subProj_bt_1553_5)
    buildType(subProj_bt_1553_4)
})
