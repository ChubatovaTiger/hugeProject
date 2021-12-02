package subProj_673

import subProj_673.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_673")
    name = "subProj 673"

    buildType(subProj_bt_673_1)
    buildType(subProj_bt_673_0)
    buildType(subProj_bt_673_5)
    buildType(subProj_bt_673_4)
    buildType(subProj_bt_673_3)
    buildType(subProj_bt_673_2)
})
