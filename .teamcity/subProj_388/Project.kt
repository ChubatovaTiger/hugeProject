package subProj_388

import subProj_388.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_388")
    name = "subProj 388"

    buildType(subProj_bt_388_5)
    buildType(subProj_bt_388_2)
    buildType(subProj_bt_388_1)
    buildType(subProj_bt_388_4)
    buildType(subProj_bt_388_3)
    buildType(subProj_bt_388_0)
})
