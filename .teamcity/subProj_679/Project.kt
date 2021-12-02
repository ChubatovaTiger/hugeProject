package subProj_679

import subProj_679.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_679")
    name = "subProj 679"

    buildType(subProj_bt_679_5)
    buildType(subProj_bt_679_4)
    buildType(subProj_bt_679_3)
    buildType(subProj_bt_679_2)
    buildType(subProj_bt_679_1)
    buildType(subProj_bt_679_0)
})
