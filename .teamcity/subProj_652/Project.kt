package subProj_652

import subProj_652.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_652")
    name = "subProj 652"

    buildType(subProj_bt_652_0)
    buildType(subProj_bt_652_5)
    buildType(subProj_bt_652_3)
    buildType(subProj_bt_652_4)
    buildType(subProj_bt_652_1)
    buildType(subProj_bt_652_2)
})
