package subProj_449

import subProj_449.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_449")
    name = "subProj 449"

    buildType(subProj_bt_449_1)
    buildType(subProj_bt_449_2)
    buildType(subProj_bt_449_0)
    buildType(subProj_bt_449_5)
    buildType(subProj_bt_449_3)
    buildType(subProj_bt_449_4)
})
