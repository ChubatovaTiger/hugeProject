package subProj_553

import subProj_553.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_553")
    name = "subProj 553"

    buildType(subProj_bt_553_1)
    buildType(subProj_bt_553_2)
    buildType(subProj_bt_553_3)
    buildType(subProj_bt_553_4)
    buildType(subProj_bt_553_5)
    buildType(subProj_bt_553_0)
})
