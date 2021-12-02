package subProj_675

import subProj_675.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_675")
    name = "subProj 675"

    buildType(subProj_bt_675_5)
    buildType(subProj_bt_675_4)
    buildType(subProj_bt_675_3)
    buildType(subProj_bt_675_2)
    buildType(subProj_bt_675_1)
    buildType(subProj_bt_675_0)
})
