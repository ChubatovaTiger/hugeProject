package subProj_676

import subProj_676.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_676")
    name = "subProj 676"

    buildType(subProj_bt_676_5)
    buildType(subProj_bt_676_4)
    buildType(subProj_bt_676_3)
    buildType(subProj_bt_676_2)
    buildType(subProj_bt_676_1)
    buildType(subProj_bt_676_0)
})
