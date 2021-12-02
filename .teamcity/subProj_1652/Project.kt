package subProj_1652

import subProj_1652.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1652")
    name = "subProj 1652"

    buildType(subProj_bt_1652_1)
    buildType(subProj_bt_1652_0)
    buildType(subProj_bt_1652_3)
    buildType(subProj_bt_1652_2)
    buildType(subProj_bt_1652_5)
    buildType(subProj_bt_1652_4)
})
